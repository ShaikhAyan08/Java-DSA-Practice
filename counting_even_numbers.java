public class counting_even_numbers {
    public static void main(String[] args) {
        int [] nums ={2,5,4,7,8,1};
        int k =3;
        int count =0;
        for(int i=0;i<k;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        System.out.println("["+count+"]");
        for(int i=k;i<nums.length;i++){
            if(nums[i]%2==0){
                count++;
            }
            if(nums[i-k]%2==0){
                count--;

            }else{

            }
            System.out.println("["+count+"]");
        }

    }
}
