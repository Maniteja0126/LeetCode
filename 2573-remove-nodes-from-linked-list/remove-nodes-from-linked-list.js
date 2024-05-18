var removeNodes = function(head) {
    let prev = null;
    let curr = head;
    while (curr !== null) {
        let next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    let dummyHead = new ListNode(-1);
    let tempPrev = dummyHead;
    curr = prev;

    while (curr !== null) {
        if (curr.val >= tempPrev.val) {
            tempPrev.next = curr;
            tempPrev = curr;
            curr = curr.next;
        } else {
            curr = curr.next;
        }
    }
    tempPrev.next = null;

    let newPrev = null;
    let newCurr = dummyHead.next;
    while (newCurr !== null) {
        let next = newCurr.next;
        newCurr.next = newPrev;
        newPrev = newCurr;
        newCurr = next;
    }

    return newPrev;
};