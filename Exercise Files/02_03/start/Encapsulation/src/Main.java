public class Main {

    public static void main(String[] args) {

        Tree myFavoriteMapleTree = new Tree(90,
                30, TreeType.MAPLE);

        System.out.println(myFavoriteMapleTree.getTreeType());
        System.out.println(myFavoriteMapleTree.getHeightFt());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());

        // myFavoriteMapleTree.heightFt = 100; // This line will cause a compilation
        // error
        myFavoriteMapleTree.grow();
    }
}
