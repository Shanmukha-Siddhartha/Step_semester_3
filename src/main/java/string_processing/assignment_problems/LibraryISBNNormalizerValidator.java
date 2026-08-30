package string_processing.assignment_problems;

public class LibraryISBNNormalizerValidator {

    public static String normalizeCode(String raw) {

        raw = raw.trim();

        if (raw.length() < 3) {
            return raw;
        }

        String publisherCode =
                raw.substring(0, 3).toUpperCase();

        String rest = raw.substring(3);

        return publisherCode + rest;
    }

    public static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {

            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        StringBuilder result = new StringBuilder();

        result.append("[")
                .append(publisher)
                .append("] YEAR: ")
                .append(year)
                .append(" | CATALOG: ")
                .append(catalog);

        return result.toString();
    }

    public static void main(String[] args) {

        String code = normalizeCode(
                " pen2026004251 "
        );

        System.out.println(
                validateAndFormat(code)
        );

        System.out.println(
                validateAndFormat(
                        normalizeCode("12N2026004251")
                )
        );
    }
}