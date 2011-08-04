package biz.nirvani.utils.format;

public class FormatUtility {

	public static String padRight(String value, int width) {
		return padRight(value, width, false);
	}

	public static String padLeft(String value, int width) {
		return padLeft(value, width, false);
	}

	public static String padRight(String value, int width,
			boolean limitSizeToWidth) {
		if (value == null)
			return null;
		if (width < 0)	return value;
		if (!limitSizeToWidth) {
			return String.format("%1$-" + width + "s", value);
		} else {
			return String.format("%1$-" + width + "." + width + "s", value);
		}

	}

	public static String padLeft(String value, int width,
			boolean limitSizeToWidth) {
		if (value == null)
			return null;
		if (width < 0)
			return value;
		if (!limitSizeToWidth) {
			return String.format("%1$#" + width + "s", value);
		} else {
			return String.format("%1$#" + width + "." + width + "s", value);
		}
	}

	public static void main(String[] args) {
		System.out.println(">" + padRight("Check123456", 16, true) + "<");
		System.out.println(">" + padRight("Check123456", 10) + "<");
		System.out.println(">" + padLeft("Check123456", 10, true) + "<");

		System.out.println(">" + padLeft("Check123456", 10) + "<");
	}
}
