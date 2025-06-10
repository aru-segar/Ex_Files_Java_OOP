public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;

    Tree(double heightFt, double trunkDiameterInches,
         TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("This is a very tall " + this.treeType + " tree!");
        } else {
            System.out.println("This tree is not that tall.");
        }
    }
}
