package com.personal.test;
import java.util.Random;
public class Base62Encode {
	private String characters;

	/**
	 * Constructs a Base62 object with the default charset (0..9a..zA..Z).
	 */
	public Base62Encode() {
		this("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}

	/**
	 * Constructs a Base62 object with a custom charset.
	 * 
	 * @param characters
	 *            the charset to use. Must be 62 characters.
	 * @throws <code>IllegalArgumentException<code> if the supplied charset is not 62 characters long.
	 */
	public Base62Encode(String characters) {
		if (!(characters.length() == 62)) {
			throw new IllegalArgumentException("Invalid string length, must be 62.");
		}
		this.characters = characters;
	}

	/**
	 * Encodes a decimal value to a Base62 <code>String</code>.
	 * 
	 * @param b10
	 *            the decimal value to encode, must be nonnegative.
	 * @return the number encoded as a Base62 <code>String</code>.
	 */
	public String encodeBase10(long b10) {
		if (b10 < 0) {
			throw new IllegalArgumentException("b10 must be nonnegative");
		}
		String ret = "";
		while (b10 > 0) {
			ret = characters.charAt((int) (b10 % 62)) + ret;
			b10 /= 62;
		}
		int x = (int) 0l;
		return ret;

	}

	/**
	 * Decodes a Base62 <code>String</code> returning a <code>long</code>.
	 * 
	 * @param b62
	 *            the Base62 <code>String</code> to decode.
	 * @return the decoded number as a <code>long</code>.
	 * @throws IllegalArgumentException
	 *             if the given <code>String</code> contains characters not
	 *             specified in the constructor.
	 */
	public long decodeBase62(String b62) {
		for (char character : b62.toCharArray()) {
			if (!characters.contains(String.valueOf(character))) {
				throw new IllegalArgumentException("Invalid character(s) in string: " + character);
			}
		}
		long ret = 0;
		b62 = new StringBuffer(b62).reverse().toString();
		long count = 1;
		for (char character : b62.toCharArray()) {
			ret += characters.indexOf(character) * count;
			count *= 62;
		}
		return ret;
	}
    public int reverse(int x) {
        long newValue = 0;
        while (x!=0){
            newValue = newValue * 10 + x % 10  ;
            x = x /10;
        }
            
        return (int)newValue;
    }
	// Examples
	public static void main(String[] args) throws InterruptedException {
		// Create a Base62 object using the default charset.
		Base62Encode base62 = new Base62Encode();
		System.gc();
		// Create a Base62 object with an alternate charset.
		Base62Encode base62alt = new Base62Encode("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
		Random rnd = new Random();
		for (long i = 3521614606207l; i < Long.MAX_VALUE; i ++ ) {
		// Encoding and decoding a number returns the original result.
			String str = base62.encodeBase10(i);
			if (str.length()>7) {
				break;
			}
			System.out.println(i + " encoded to Base62 and back again: "
					+ base62.encodeBase10(i) + "   "+ base62.decodeBase62(base62.encodeBase10(i)));
			if (rnd.nextLong() % 2 == 0) {
				//i *=2;
			}
		}
		
		System.out.println(base62.reverse(1534236469));
		// Using invalid characters throws a runtime exception.
		// Output was out of order with ant, adding this short sleep fixes
		// things:
		// The problem seems to be with the way ant's output handles system.err
		char ch = '0';
		int i = 10;
		i = i +Character.getNumericValue(ch);
		System.out.println(i);
		Long l = Long.MAX_VALUE;

		System.out.println(l.intValue());
	}
}
