package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;

import org.omg.Messaging.SyncScopeHelper;

public class CollectionEach {

	public static void main(String[] args) {
		Collection books=new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		Iterator it=books.iterator();
		while(it.hasNext())
		{
			String book=(String)it.next();
			System.out.println(book);
			if(book.equals("���Java����"));
			{ 
				it.remove();
				
			}
			book="�����ַ���";	
		}
		System.out.println(books);
		
	}

}
