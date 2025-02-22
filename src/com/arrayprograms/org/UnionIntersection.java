package com.arrayprograms.org;
import java.util.Arrays;

public class UnionIntersection {

	// Method to find the union of multiple arrays
	public static int[] union(int[][] arrays) {
		int totalSize = 0;
		for (int i = 0; i < arrays.length; i++) {
			totalSize += arrays[i].length;
		}

		int[] unionArray = new int[totalSize];
		int index = 0;

		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				int element = arrays[i][j];
				if (!contains(unionArray, index, element)) {
					unionArray[index++] = element;
				}
			}
		}

		return Arrays.copyOf(unionArray, index);
	}

	// Method to find the intersection of multiple arrays
	public static int[] intersection(int[][] arrays) {
		if (arrays.length == 0) {
			return new int[0];
		}

		int[] firstArray = arrays[0];
		int[] intersectionArray = new int[firstArray.length];
		int index = 0;

		for (int i = 0; i < firstArray.length; i++) {
			int element = firstArray[i];
			boolean isInAllArrays = true;

			for (int j = 1; j < arrays.length; j++) {
				if (!contains(arrays[j], element)) {
					isInAllArrays = false;
					break;
				}
			}
			
			if (isInAllArrays && !contains(intersectionArray, index, element)) {
				intersectionArray[index++] = element;
			}
		}

		return Arrays.copyOf(intersectionArray, index);
	}

	// Helper method to check if an element is present in an array (up to a certain index)
	private static boolean contains(int[] array, int length, int element) {
		for (int i = 0; i < length; i++) {
			if (array[i] == element) {
				return true;
			}
		}
		return false;
	}

	// Helper method to check if an element is present in an array
	private static boolean contains(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] arrays = {
				{1, 2, 3, 4},
				{3, 4, 5, 6},
				{4, 5, 6, 7}
		};

		int[] unionResult = union(arrays);
		int[] intersectionResult = intersection(arrays);

		System.out.println("Union: " + Arrays.toString(unionResult));
		System.out.println("Intersection: " + Arrays.toString(intersectionResult));
	}
}





