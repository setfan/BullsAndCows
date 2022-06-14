import java.util.*;

class AsciiCharSequence implements CharSequence {
    byte[] sequence;

    AsciiCharSequence(byte[] sequence) {
        this.sequence = Arrays.copyOf(sequence, sequence.length);
    }

    @Override
    public int length() {
        return this.sequence.length;
    }

    @Override
    public char charAt(int index) {

        return (char) this.sequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(this.sequence, start, end));

    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < this.length(); i++) {
            result.append((char) this.sequence[i]);
        }

        return result.toString();
    }
}
