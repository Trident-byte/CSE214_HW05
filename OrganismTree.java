/**
 * The <code>OrganismTree</code> represents
 * the ternary tree of OrganismNode objects.
 *
 * @author Brian Chau
 *    email brian.chau@stonybrook.edu
 *    Stony Brook ID: 116125954
 *    Recitation: 02
 **/

public class OrganismTree {
    private OrganismNode root;
    private OrganismNode cursor;

    /**
     * Creates a new organism tree with an apexPredator
     *
     * @param apexPredator
     *    The node representing the apex predator
     *
     * <dt>Postcondition
     *    <dd>An OrganismTree object is made, with apexPredator
     *         representing the apex predator. Both root and cursor
     *         reference this node.</dd>
     */
    public OrganismTree(OrganismNode apexPredator){
        root = apexPredator;
        cursor = root;
    }

    /**
     * Moves the cursor back to the root of the tree.
     *
     * <dt>Postcondition
     *    <dd>cursor now references the root of the tree.</dd>
     */
    public void resetCursor(){
        cursor = root;
    }

    /**
     * Moves cursor to one of cursor’s children.
     *
     * <dt>Precondition
     *    <dd>name references a valid name of one of cursor’s children.</dd>
     *
     * <dt>Postcondition
     *    <dd> Either an exception is thrown, or cursor now points to the node whose
     *         name is referenced by name, and cursor now points to a child of the
     *         original cursor reference.</dd>
     *
     * @param name
     *     The name of the node to be moved to.
     * @throws IllegalArgumentException
     *    Thrown if name does not reference a direct, valid child of cursor.
     */
    public void moveCursor(String name) throws IllegalArgumentException{
        if(cursor.getLeft() != null && name.equals(cursor.getLeft().getName())){
            cursor = cursor.getLeft();
        }
        else if(cursor.getRight() != null && name.equals(cursor.getRight().getName())){
            cursor = cursor.getRight();
        }
        else if(cursor.getMiddle() != null && name.equals(cursor.getMiddle().getName())){
            cursor = cursor.getMiddle();
        }
        else{
            throw new IllegalArgumentException("The current animal does not eat " + name);
        }
    }

    /**
     * Returns a String including the organism at cursor and all its possible prey
     *
     * <dt>Postcondition
     *    <dd>cursor has not moved.</dd>
     *
     * @return
     *    A String containing the name of the cursor, and all the cursor’s possible prey.
     * @throws IsPlantException
     *    Thrown if the cursor currently references a plant object.
     */
    public String listPrey() throws IsPlantException{
        if(cursor.getIsPlant()){
            throw new IsPlantException();
        }
        String answer = "";
        if(cursor.getLeft() == null){
            return answer;
        }
        answer += cursor.getLeft().getName();
        if(cursor.getMiddle() == null){
            return answer;
        }
        answer += cursor.getMiddle().getName();
        if(cursor.getRight() == null){
            return answer;
        }
        answer += cursor.getRight().getName();
        return answer;
    }
}
