package crudOperations;

import java.util.Arrays;

public class ArrayOperations {
	public int[] insert(int a[],int ele,int pos) {
		if(pos>a.length+1||pos<=0) {
			System.out.println("Insertion is not possible");
		}
		else {
			int b[]=new int[a.length+1];
			for(int i=0,j=0;i<b.length;i++) {
				if(i==pos-1) {
					b[i]=ele;
				}
				else{ 
					b[i]=a[j++];
				}
			}
			return b;
		}
		return a;
	}
	public int[] insertAll(int a[],int b[]) {
		int c[]=new int[a.length+b.length];
		for(int i=0,j=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[j++];
			}
		}
		return c;
	}
	public void display(int a[]) {
		System.out.println(Arrays.toString(a));
	}
	public int[] delete(int a[],int ele) {
		int ind=firstOccur(a,ele);
		if(a.length==0) {
			System.out.println("Array is empty");
		}
		else if(ind==-1) {
			System.out.println("element is not present");
		}
		else {
			int b[]=new int[a.length-1];
			for(int i=0,j=0;i<a.length;i++) {
				if(ind!=i) {
					b[j++]=a[i];
				}
			}
			return b;
		}
		return a;
	}
	public int[] deleteAll(int a[],int ele) {
		int n=occurances(a,ele);
		if(a.length==0) {
			System.out.println("Array is empty");
		}
		else if(n==0) {
			System.out.println("element is not present");
		}
		else {
			int b[]=new int[a.length-n];
			for(int i=0,j=0;i<a.length;i++) {
				if(ele!=a[i]) {
					b[j++]=a[i];
				}
			}
			return b;
		}
		return a;
	}
	public int[] update(int a[],int o_ele,int n_ele) {
		int ind=firstOccur(a,o_ele);
		if(a.length==0) {
			System.out.println("Array is empty");
		}
		else if(ind==-1) {
			System.out.println("element is not present");
		}
		else {
			a[ind]=n_ele;
		}	
		return a;
	}
	public int[] updateAll(int a[],int o_ele,int n_ele) {
		int ind=firstOccur(a,o_ele);
		if(a.length==0) {
			System.out.println("Array is empty");
		}
		else if(ind==-1) {
			System.out.println("element is not present");
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(a[i]==o_ele) {
					a[i]=n_ele;
				}
			}
		}	
		return a;
	}
	public int occurances(int a[],int ele){
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				count++;
			}
		}
		return count;
	}
	public int firstOccur(int a[],int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	public int lastOccur(int a[],int ele) {
		int l=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				l=i;
			}
		}
		return l;
	}
	public int[] sort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		return a;
	}
	public boolean isEmpty(int a[]) {
		return a.length==0;
	}
	public int max(int a[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public int min(int a[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public int sum(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public int avg(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		int avg=sum/a.length;
		return avg;
	}
	public int[] reverse(int a[]) {
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		return a;
	}
	public int[] clear(int a[]) {
		int b[]=new int[0];
		return b;
	}
	public boolean exit() {
		return false;
	}
}
