import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * List接口：
 * 特点：
 *
 *
 * arrayList 的底层实现为数组，查找速度快，插入和删除的速度慢，在内存中的开销是因为list尾部有空余（）
 *
 * linkedList 的底层实现是双向链表，插入和删除的速度很快，但是查询的速度很慢，在在内存中的开销是因为每一个节点都要有数据、直接后继，直接前驱
 *
 * Set接口：
 * hashset:
 *      它不允许出现重复元素；
        不保证和政集合中元素的顺序
 *
 * TreeSet: 描述的是Set的一种变体——可以实现排序等功能的集合，它在讲对象元素添加到集合中时会自动按照某种比较规则将其插入到有序的对象序列中，
 *  并保证该集合元素按照“升序”排列。
 *
 *  HashSet : 为快速查找设计的Set。存入HashSet的对象必须定义hashCode()。

 　　TreeSet : 保存次序的Set, 底层为树结构。使用它可以从Set中提取有序的序列。

 　　LinkedHashSet : 具有HashSet的查询速度，且内部使用链表维护元素的顺序(插入的次序)。于是在使用迭代器遍历Set时，结果会按元素插入的次序显示。
 */
public class CollectionTest {
    public static void main(String[] args) {

        List arrayList = new ArrayList();
        System.out.println("初始容量为10在java8的文档中显示" + arrayList.size());

        List linkedList = new LinkedList();
        linkedList.add("haha");
        linkedList.add("haha");
        System.out.println(linkedList.size());

        List vector = new Vector();
        System.out.println(vector);

        Set hashSet = new HashSet();
        System.out.println(hashSet.size());

        Set treeSet = new TreeSet();
        Set<Object> objects = new LinkedHashSet<>();

        Map hashMap = new HashMap();
        hashMap.put(1,"jack");
        hashMap.put(2,"yezi");
        hashMap.put(3,"jackli");
        hashMap.put(4,"yudian");
        System.out.println(hashMap);

        Set set = hashMap.keySet();
        System.out.println(set);

        Collection values = hashMap.values();
        System.out.println(values);

        Set<Map.Entry<Integer, String>> set1 = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : set1) {
            Integer key = entry.getKey();
        }


    }
}
