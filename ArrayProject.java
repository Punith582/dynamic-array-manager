package crudOperations;

import java.util.Scanner;

public class ArrayProject {
	static ArrayOperations obj=new ArrayOperations();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter array size(>=0):");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element:"+(i+1));
			a[i]=sc.nextInt();
		}
		obj.display(a);
		while(true) {
			boolean temp=false;
			System.out.println("\n1.Insert\n2.InsertAll\n3.Delete\n4.DeleteAll\n5.Update\n6.UpadteAll\n7.Occurance\n8.FirstOccurance\n9.LastOcuurance\n10.sort\n11.Reverse\n12.Min\n13.Max\n14.sum\n15.Avg\n16.Display\n17.clear\n18.isEmpty\n19.Exit");
			int opt=sc.nextInt();
			switch(opt) {
			case 1:{
				System.out.println("Enter element to insert");
				int ele=sc.nextInt();
				System.out.println("Enter position");
				int pos=sc.nextInt();
				a=obj.insert(a,ele,pos);
				obj.display(a);
				break;
			}
			case 2:{
				System.out.println("Enter how many elements  you want to insert");
				int n=sc.nextInt();
				int b[]=new int[n];
				for(int i=0;i<n;i++) {
					System.out.println("Eneter element:"+(i+1));
					b[i]=sc.nextInt();
				}
				a=obj.insertAll(a,b);
				obj.display(a);
				break;
			}
			case 3:{
				System.out.println("Enter element to delete:");
				int ele=sc.nextInt();
				a=obj.delete(a, ele);
				obj.display(a);
				break;
			}	
			case 4:{
				System.out.println("Enter element to delete:");
				int ele=sc.nextInt();
				a=obj.deleteAll(a, ele);
				obj.display(a);
				break;
			}
			case 5:{
				System.out.println("Enter where you want to update the element(as old element):");
				int o_ele=sc.nextInt();
				System.out.println("Enter new element to update:");
				int n_ele=sc.nextInt();
				a=obj.update(a, o_ele, n_ele);
				obj.display(a);
				break;
			}
			case 6:{
				System.out.println("Enter where you want to update the element(as old element):");
				int o_ele=sc.nextInt();
				System.out.println("Enter new element to update:");
				int n_ele=sc.nextInt();
				a=obj.updateAll(a, o_ele, n_ele);
				obj.display(a);
				break;
			}
			case 7:{
				System.out.println("Enter a element");
				int ele=sc.nextInt();
				System.out.println(obj.occurances(a, ele));
				break;
			}
			case 8:{
				System.out.println("Enter a element:");
				int ele=sc.nextInt();
				System.out.println(obj.firstOccur(a, ele)+1);
				break;
			}
			case 9:{
				System.out.println("Enter a element:");
				int ele=sc.nextInt();
				System.out.println(obj.lastOccur(a, ele)+1);
				break;
			}
			case 10:{
				a=obj.sort(a);
				obj.display(a);
				break;
			}
			case 11:{
				obj.reverse(a);
				obj.display(a);
				break;
			}
			case 12:{
				System.out.println(obj.min(a));
				break;
			}
			case 13:{
				System.out.println(obj.max(a));
				break;
			}
			case 14:{
				System.out.println(obj.sum(a));
				break;
			}
			case 15:{
				System.out.println(obj.avg(a));
				break;
			}
			case 16:{
				obj.display(a);
				break;
			}
			case 17:{
				a=obj.clear(a);
				obj.display(a);
				break;
			}
			case 18:{
				System.out.println(obj.isEmpty(a));
				break;
			}
			case 19:{
				temp=true;
				break;
			}
			default:{
				System.out.println("please choose correct option...!");
			}
			}
			if(temp) {
				System.out.println("Thank you.....!");
				break;
			}
		}
	}
}
