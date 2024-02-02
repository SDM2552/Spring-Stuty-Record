package sort;



public class MergeSort {
	
	private static int[] sorted; // 합치는 과정에서 정렬하여 원수를 담을 임시배열
	
	//배열을 합병 정렬하는 메소드
	public static void merge_sort(int[] a) {
		sorted = new int[a.length];
		merge_sort(a,0,a.length-1);
		sorted=null;
	}
	
	//배열의 특정 범위를 합병 정렬하는 메소드
	//Top-Down 방식 구현
	private static void merge_sort(int[]a, int left, int right) {
		
		//leff==right 즉, 부분리스트가 1개의 원소만 갖고 있는 경우
		//더이상 쪼갤 수 없으므로 return한다.
		if(left==right) return;
		
		int mid=(left+right)/2; //절반 위치
		
		merge_sort(a, left, mid); //절반 중 왼쪽 부분리스트(left~mid)
		merge_sort(a, mid+1, right); //절반 중 오른쪽 부분리스트(mid+1~right)
		
		merge(a, left, mid, right); //병합
	
	 
	} 
	
	
	/*
	 *@param a 정렬할 배열
	 *@param left 배열의 시작점
	 *@param mid 배열의 중간점
	 *@param right 배열의 끝 점
	 */
	
	private static void merge(int[] a, int left, int mid, int right) {
		
		int l=left; //왼쪽 부분리스트 시작점
		int r=mid+1; //오른쪽 부분리스트 시작점
		int idx=left; //채워넣을 배열의 인덱스
		
		while(l<=mid && r< right) {
			
			//왼쪽 부분리스트 1번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
			//왼쪽의 1번째 원소를  새 배열에 넣ㄱ 1과 idx를 1 증가시킨다.
			if(a[l]<=a[r]) {
				sorted[idx]=a[l];
				idx++;
				l++;
			}
			//오른쪽 부분리스트 r번째 원소가 왼쪽 부분리스트 1번째 원소보다 작거나 같을 경우
			//오른쪽 r번째 원소를 새 배열에 넣고 r과 idx를 1 증가시킨다.
			else {
				sorted[idx]=a[r];
				idx++;
				r++;
			}
		}
		
		//왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우(l>mid)
		//==오른쪽 부분리스트 원소가 남아있는 경우
		//오른쪽 부분리스트의 남은 원소들을 새 배열에 채워준다.
		if(l>mid) {
			while(r<=right) {
				sorted[idx]=a[r];
				idx++;
				r++;
			}
		}
		//오른쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우(r>mid)
		//위와 같게 왼쪽 부분리스트 남은 원소들을 새 배열에 채워준다.
		else {
			while(l<=mid) {
				sorted[idx]=a[l];
				idx++;
				l++;
			}
		}
		//정렬된 새 배열을 기존의 배열에 복사해서 옮긴다.
		for(int i=left; i<=right; i++) {
			a[i]=sorted[i];
		}
	}
	
	

	public static void main(String[] args) {

		int[] a = new int[] {4, 6, 10, 3, 20, 43, 16, 8, 40};
		
		merge_sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
