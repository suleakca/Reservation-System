package com.structures.maxheap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import com.structures.reservation.Customer;

public class MaxHeap {

    Customer[] heap;
    int size;

    public MaxHeap(LinkedList<Customer> theList) {
        this.size = theList.size();
    }
    
    public void maxHeapify(int index) {
        int largest = index;
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        if (leftIndex < size && heap[index].compareTo(heap[leftIndex])<0) {
            largest = leftIndex;
        }
        if (rightIndex < size && heap[largest].compareTo(heap[rightIndex])<0) {
            largest = rightIndex;
        }

        if (largest != index) {
            swap(index, largest);
            maxHeapify(largest);
        }
    }

    public void buildMaxHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    /**
     * Insert a new element into the heap satisfying
     * the heap property.
     */
    public void insert(Customer elem) {
    	if(heap == null || heap.length==0) {
    		heap = new Customer[] {elem};
    		return;
    	}
        // increase heap size
        heap = Arrays.copyOf(heap, size + 1);
        int i = size;
        int parentIndex = (int) Math.floor((i - 1) / 2);
        // move up through the heap till you find the right position
        while (i > 0 && elem.compareTo(heap[parentIndex]) > 0) {
            heap[i] = heap[parentIndex];
            i = parentIndex;
            parentIndex = (int) Math.floor((i - 1) / 2);
        }
        heap[i] = elem;
        size++;
    }

    public Customer findMax() {
        if (size == 0) {
            return null;
        } else {
            return heap[0];
        }
    }

    public Customer extractMax() {
        if (size == 0) return null;

        Customer min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        maxHeapify(0);
        return min;
    }

    public int getSize() {
        return size;
    }

    public Customer[] getHeap() {
        return heap;
    }

    public void printHeap() {
        if (heap == null) {
            System.out.println("null");
            return;
        }
        int iMax = size - 1, i;
        if (iMax == -1)
            System.out.println("[]");

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (i = 0; i < iMax; i++) {
            b.append(heap[i]);
            b.append(", ");
        }
        System.out.println(b.append(heap[i]).append("]\n").toString());
    }

    private void swap(int firstIndex, int secondIndex) {
        Customer temp = heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = temp;
    }
       // test cases
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	LinkedList<Customer> theList = new LinkedList<>();
        
    	//int[] a = new int[]{2, 4, 5, 1, 6, 7, 8};
        MaxHeap maxHeap = new MaxHeap(theList);
        maxHeap.printHeap();
        maxHeap.buildMaxHeap();
        maxHeap.printHeap();
        maxHeap.extractMax();
        maxHeap.printHeap();
        Customer c = new Customer();
        maxHeap.insert(c);
        maxHeap.printHeap();
        
    }
}
