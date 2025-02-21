class FindElements {
    private Set<Integer> recoveredValues;

    public FindElements(TreeNode root) {
        recoveredValues = new HashSet<>();
        recoverTree(root, 0);
    }

    private void recoverTree(TreeNode node, int value) {
        if (node == null){
         return;
         } 
        node.val = value;
        recoveredValues.add(value); 
        recoverTree(node.left, 2 * value + 1); // Recover left child
        recoverTree(node.right, 2 * value + 2); // Recover right child
    }

    public boolean find(int target) {
        return recoveredValues.contains(target); 
    }
}