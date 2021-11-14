/**
 * Project name(项目名称)：算法_顺序表的实现之增删功能
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyArrayList
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/14
 * Time(创建时间)： 13:16
 * Version(版本): 1.0
 * Description(描述)：
 * 向表中添加元素；
 * 向表中指定位置添加元素；
 * 删除指定位置的元素并返回被删除的元素。
 * 平台将创建用户补全后的MyArrayList类的对象；
 * 调用对象的Add(int item)方法，向表中添加测试数据；
 * 调用对象的Add(int index, int item)方法，向表中指定位置添加测试数据；
 * 调用对象的remove(int index)方法删除指定位置的数据并输出；
 * 调用对象的size()方法返回表的大小；
 * 根据输出结果判断程序是否正确。
 */

/**
 * Created by zengpeng on 2017/12/25.
 */
public class MyArrayList
{
    private int[] elements;//元素
    private int size;//List中当前的元素个数

    public MyArrayList()
    {
        this(1);//List默认大小为1
    }

    /**
     * 按指定大小capacity构造List
     *
     * @param capacity List初始化时的大小
     */
    public MyArrayList(int capacity)
    {
        elements = new int[capacity];
        size = 0;
    }

    /**
     * 返回List中元素的个数
     *
     * @return
     */
    public int size()
    {
        return size;
    }

    /**
     * 添加一个元素到末尾
     *
     * @param item
     */
    public void Add(int item)
    {
        int len = elements.length;
        if (size == len - 1)
        {
            resize(2 * len);
        }
        /********** Begin *********/
        elements[size] = item;
        size++;
        /********** End *********/
    }

    /**
     * 添加一个元素到指定位置index
     *
     * @param index
     * @param item
     */
    public void Add(int index, int item)
    {
        validateRangeForAdd(index);
        int len = elements.length;
        if (size == len - 1)
        {
            resize(2 * len);
        }
        /********** Begin *********/
        size++;
        for (int i = size - 1; i >= index; i--)
        {
            elements[i + 1] = elements[i];
        }
        elements[index] = item;
        /********** End *********/
    }

    /**
     * 删除指定位置index的元素,并返回被删除的元素
     *
     * @param index
     * @return 被删除的元素
     */
    public int remove(int index)
    {
        validateRange(index);
        /********** Begin *********/
        int result = elements[index];
        for (int i = index; i < size; i++)
        {
            elements[i] = elements[1 + i];
        }
        size--;
        return result;

        /********** End *********/
    }

    public int remove()
    {
        if (size == 0)
        {
            System.out.println("删除失败！！！元素为空");
            return -1;
        }
        else
        {
            int result = elements[size - 1];
            size--;
            return result;
        }
    }

    /**
     * 校验索引范围
     *
     * @param index
     */
    private void validateRange(int index)
    {
        if (index >= size || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("索引越界了哦！Index: " + index + ", Size: " + size);
        }
    }

    /**
     * 校验索引范围
     *
     * @param index
     */
    private void validateRangeForAdd(int index)
    {
        if (index > size || index < 0)
        {
            throw new IndexOutOfBoundsException("索引越界了哦！Index: " + index + ", Size: " + size);
        }
    }

    /**
     * 动态扩展数组大小
     *
     * @param capacity
     */
    private void resize(int capacity)
    {
        assert capacity > size;
        int[] tmp = new int[capacity];
        for (int i = 0; i < size; i++)
        {
            tmp[i] = elements[i];
        }
        elements = tmp;
    }

    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}