public class StringBufferAndStringBuilder {
    public static void main(String[]args){
        StringBuffer st = new StringBuffer("Hello, Vikas Pradhan.");
        st.delete(3,6);
        st.append("Vivaan");
        st.insert(4,"ABC");
        st.replace(6,9,"Red");

        System.out.print(st);
    }
}
