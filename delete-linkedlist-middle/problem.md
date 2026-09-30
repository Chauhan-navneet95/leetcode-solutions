# Delete the Middle Node of a Linked List

- **Platform:** LeetCode
- **Problem:** 2095
- **Source:** https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

## Summary

Given the head of a singly linked list, remove its middle node and return the updated head. For an even-length list, remove the node at index `n / 2` (zero-based). If the list has one node, return `null`.

## Approach

Use slow and fast pointers to locate the node immediately before the middle, then unlink the middle node in one pass.

## Complexity

- **Time:** O(n)
- **Space:** O(1)
