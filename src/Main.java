public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String str = InputConfig.getString();
        String maxStr = "";
        //Tìm chuỗi tăng dần có độ dài lớn nhất
        for (int i = 0; i < str.length(); i++) {//1 vòng lặp ngoài
            //1 chuỗi trung gian lưu trữ chuỗi tăng dần
            String currentStr = String.valueOf(str.charAt(i));
            for (int j = i; j < str.length(); j++) {//1 vòng lặp trong
                int endIndex = currentStr.length() - 1;//1 phép gán
                if (currentStr.charAt(endIndex) < str.charAt(j)) {//1 phép so sánh
                    currentStr += str.charAt(j);
                }
            }
            if (maxStr.length() < currentStr.length()) {//1 phép so sánh
                maxStr = currentStr;
            }
        }
        System.out.println("Chuỗi tăng dần dài nhất là: " + maxStr);
    }
    /*********************************************************************************
     * Tính toán độ phức tạp của bài toán này:                                        *
     * 	1 vòng lặp trong * 2 câu lệnh = 2;                                            *
     * 	=> 1 vòng lặp ngoài * (2 câu lệnh+ 1 vòng lặp) = 1 * (2 + 2) = 4;             *
     *                                                                                *
     * 	T(n) = O(n)                                                                   *
     *  Độ phức tạp của bài toán là O(n)                                           	  *
     *********************************************************************************/
}
