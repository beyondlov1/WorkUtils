package excel.utils.convertor;

public class ChineseCharToEnForWork {

    private static void getEnsFromChineseChars(String chinese, String splitRegex, String prefix,String suffix){
        ChineseCharToEn chineseCharToEn =ChineseCharToEn.getInstance();
        String[] split = chinese.split(splitRegex);
        for (String string :
                split) {
            System.out.println(prefix+chineseCharToEn.getAllFirstLetter(string)+suffix);
        }
    }
    public static void main(String[] args){
        String string = "发都发空间\n" +
                "发达的\n" +
                "阿凡达擦\n" +
                "爱唱反调\n" +
                "峰法国人\n";
        getEnsFromChineseChars(string,"\n","q_","_con");
    }
}
