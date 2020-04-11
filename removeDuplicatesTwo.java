public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.next.val == current.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
}

private static void insertionSortRecursive(int[] input, int i) {
    if (i <= 1) {
        return;
    }
    insertionSortRecursive(input, i - 1);
    int key = input[i - 1];
    int j = i - 2;
    while (j >= 0 && input[j] > key) {
        input[j + 1] = input[j];
        j = j - 1;
    }
    input[j + 1] = key;
}