package show.designMode.templateMethod;

/**
 * @author zhengfawei
 * @create 2019-04-29 上午10:00
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);

    }
}
