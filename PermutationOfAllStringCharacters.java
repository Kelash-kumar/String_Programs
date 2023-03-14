public class PermutationOfAllStringCharacters{
    public PermutationOfAllStringCharacters(String str){
int length=str.length();
int fact=factorail(length);

for(int i=0;i<fact;i++){

}

    }

    int factorail(int n){
if(n==0)return 1;
return factorail(n-1);
    }
    public static void main(String[] args) {
        
    }
}

