package randoms;

public class Blender {
	public void blend(){
        System.out.println("There's nothing to blend here boss.");
    }

    public void blend(String fruit1, String fruit2){
        System.out.println("BLending " + fruit1 + " and " + fruit2 + " boss.");
    }
    public void blend(String fruit1, String fruit2, int n){
        for(int i = 0; i < n; i++){
            System.out.println("BLending " + fruit1 + " and " + fruit2 + " boss.");
        }
    }
}
