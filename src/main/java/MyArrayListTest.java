/**
 * Project name(项目名称)：算法_顺序表的实现之增删功能
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyArrayListTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/14
 * Time(创建时间)： 13:16
 * Version(版本): 1.0
 * Description(描述)：
 * 预期输出
 *
 * 5
 * 4
 * 7
 * -1
 * -6
 */

public class MyArrayListTest
{
    public static void main(String[] args)
    {
        MyArrayList list = new MyArrayList();

        list.Add(0, 3);
        list.display();
        list.Add(5);
        list.display();
        list.Add(7);
        list.display();
        list.Add(-1);
        list.display();
        list.Add(2, 4);
        list.display();
        list.Add(-6);
        list.display();
        list.remove(0);
        list.display();
        while (list.size() > 0)
        {
            System.out.println(list.remove(0));
        }
         /*
        list.Add(6);
        list.Add(7);
        list.Add(8);
        list.Add(9);
        list.display();
        list.Add(1,3);
        list.display();
        System.out.println(list.remove(3));
        list.display();
        */

    }
}
