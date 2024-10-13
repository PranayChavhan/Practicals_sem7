# Huffman Encoding Using a Greedy Strategy

This Java program implements **Huffman Encoding** using a **greedy strategy** to compress a given text based on character frequency.

## Explanation

### Huffman Encoding:
Huffman Encoding is a lossless data compression algorithm. The algorithm assigns variable-length codes to input characters, with shorter codes assigned to more frequent characters. The Huffman Tree is built using a **greedy strategy**, ensuring that characters with higher frequencies get shorter codes.

### Steps:
1. Count the frequency of each character in the input text.
2. Build a **Huffman Tree** based on the character frequencies using a **min-heap** (priority queue).
3. Traverse the Huffman Tree to generate binary codes for each character.

---

## Test Cases

### Test Case 1:
**Input:** `"huffman encoding example"`  
**Expected Output:**  
Huffman Codes: `{e=01, a=000, f=110, g=1010, h=1000, i=1001, l=1011, m=111, n=11, o=001, p=1101, u=00}`  
Original text: `huffman encoding example`  
Encoded text: `100011010111011001101010011101100100111101011100101101001011101`

### Test Case 2:
**Input:** `"hello world"`  
**Expected Output:**  
Huffman Codes: `{d=111, e=1100, h=1010, l=1101, o=100, r=1011, w=001, space=000}`  
Original text: `hello world`  
Encoded text: `10101100110110101100110001010100111`

### Test Case 3:
**Input:** `"abcdef"`  
**Expected Output:**  
Huffman Codes: `{a=100, b=101, c=110, d=111, e=000, f=001}`  
Original text: `abcdef`  
Encoded text: `100101110111000001`

---

## Dry Run

### Input: `"abc"`

1. **Frequency Calculation:**
a: 1, b: 1, c: 1


2. **Huffman Tree Construction:**
- Create min-heap of all characters with their frequencies.
- Merge nodes with smallest frequencies and repeat until the tree is built.

3. **Huffman Codes:**
Assign binary codes to characters based on their position in the tree.

| Character | Huffman Code |
|-----------|--------------|
| a         | 00           |
| b         | 01           |
| c         | 1            |

4. **Encoded Output:**  
Original text: `"abc"`  
Encoded text: `00101`

---

## Time and Space Complexity

### Time Complexity:
- **Building the Huffman Tree:** O(n log n)  
The tree is built using a priority queue (min-heap) that takes O(log n) time for each insertion and removal, where `n` is the number of unique characters.

- **Generating Codes:** O(n)  
Traversing the tree to generate codes takes O(n), where `n` is the number of characters in the input.

### Space Complexity:
- **Space Complexity:** O(n)  
Space is needed for the frequency map, priority queue, and the tree itself, where `n` is the number of unique characters.

---