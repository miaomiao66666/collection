package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("�����");
		c.add('��');
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:"+c.size());
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ:"+c.size());
		System.out.println("c�����Ƿ����\"�����\"�ַ���:"+c.contains("�����"));
		c.add("������ Java EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ��:"+c);
		Collection books=new HashSet();
		books.add("������ Java EE��ҵӦ��ʵս");
		books.add("��� Java����");
		System.out.println("c�����Ƿ���ȫ����books����?"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ��:"+c);
		c.clear();
		System.out.println("c���ϵ�Ԫ��:"+c);
		books.retainAll(c);
		System.out.println("bokks���ϵ�Ԫ��:"+books);

	}

}
