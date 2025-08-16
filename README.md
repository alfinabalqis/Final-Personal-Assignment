# 📚 Data Structures and Algorithm Analysis - Final Exam Solutions
> **Final Exam Solutions for COSC6025036 - Data Structures and Algorithm Analysis**  
> BINUS University | Academic Year 2024/2025 | Alfina Balqis Nurzaharani - 2802582152

### 🎓 Course Information
- **Course Code:** COSC6025036
- **Course Name:** Data Structures and Algorithm Analysis
- **Institution:** BINUS University
- **Academic Year:** 2024/2025
- **Exam Type:** Final Exam (Open Book)

## 🎯 Exam Problems

| Problem | Topic |
|---------|-------|
| **Problem 1** | Object-Oriented Programming (OOP) |
| **Problem 2** | Single Linked List |
| **Problem 3** | Circular Queue (Array & Linked List) |
| **Problem 4** | Binary Search Tree (BST) |
| **Problem 5** | Hash Table with Linear Probing |

## 🛠️ Solutions

### 🔹 Problem 1: Zoo Management System (OOP)
**Implementation of Object-Oriented Programming concepts**

#### Features:
- **Inheritance:** `Animal` → `Herbivore` & `Carnivore`
- **Polymorphism:** Different implementations of `displayFoodInfo()`
- **Encapsulation:** Private attributes with public getters

```java
// Example usage
Animal deer = new Herbivore("Rusa", "Cervidae");
Animal tiger = new Carnivore("Harimau", "Panthera tigris");

deer.displayFoodInfo();  // Output: "Rusa (Cervidae) makan tumbuhan."
tiger.displayFoodInfo(); // Output: "Harimau (Panthera tigris) makan daging."
```

#### 📐 Class Diagram:
```
        Animal (Parent)
           ↙    ↘
   Herbivore    Carnivore
    (Child)      (Child)
```

---

### 🔹 Problem 2: Single Linked List Operations
**Implementation of dynamic data structure with insertion and deletion**

#### Operations:
- ✅ **Insert all elements:** `43, 5, 9, 42, 6, 11, 41, 36, 16, 35, 14, 30, 25, 7, 13, 100, 12, 70, 24, 40`
- ✅ **Insert 15 after 12:** Dynamic insertion at specific position
- ✅ **Delete 24:** Element removal with pointer manipulation

#### 🔗 Final Structure:
```
43 → 5 → 9 → 42 → 6 → 11 → 41 → 36 → 16 → 35 → 14 → 30 → 25 → 7 → 13 → 100 → 12 → 15 → 70 → 40 → NULL
```

---

### 🔹 Problem 3: Circular Queue Implementation
**Two implementations: Array-based and Linked List-based**

#### Data Set:
`43, 5, 9, 42, 6, 11, 41, 7, 13, 100, 12, 70, 24, 40, 36, 16, 35, 14, 30, 25`

#### Array Implementation:
- **Circular indexing:** `(index + 1) % capacity`
- **Space complexity:** O(n)
- **Time complexity:** O(1) for enqueue/dequeue

#### Linked List Implementation:
- **Circular linking:** `rear.next = front`
- **Dynamic size:** No fixed capacity limit
- **Memory efficient:** Only allocates needed space

---

### 🔹 Problem 4: Binary Search Tree Construction
**Step-by-step BST building with duplicate handling**

#### Insert Sequence:
`20, 17, 12, 14, 27, 9, 23, 20, 21, 27`

#### 🌳 Final BST Structure:
```
        20
       /  \
     17    27
    /     /
   12    23
  / \   /
 9  14 21
```

#### Key Rules:
- **Left child:** `value < parent`
- **Right child:** `value > parent`
- **Duplicates:** Ignored (BST property)

#### Step-by-Step Visualization:
1. **Insert 20:** Root node
2. **Insert 17:** 17 < 20 → left of 20
3. **Insert 12:** 12 < 20 → left, 12 < 17 → left of 17
4. **Insert 14:** Path: 20 → 17 → 12, 14 > 12 → right of 12
5. **Insert 27:** 27 > 20 → right of 20
6. **Insert 9:** Path: 20 → 17 → 12, 9 < 12 → left of 12
7. **Insert 23:** Path: 20 → 27, 23 < 27 → left of 27
8. **Insert 20:** Duplicate → ignored
9. **Insert 21:** Path: 20 → 27 → 23, 21 < 23 → left of 23
10. **Insert 27:** Duplicate → ignored

---

### 🔹 Problem 5: Hash Table with Linear Probing
**Collision resolution using linear probing technique**

#### Hash Function:
```java
h(key) = (Σ ASCII values) mod 8
```

#### Items to Insert:
`Anting, Baju, Celana, Gelas, Gunting, Handphone, Buku, Garpu`

#### 📊 Final Hash Table:

| Index | Value | Hash Calculation |
|-------|-------|------------------|
| **0** | Buku | h("Buku") = 407 % 8 = 7 → collision → probe to 0 |
| **1** | Anting | h("Anting") = 609 % 8 = 1 |
| **2** | Baju | h("Baju") = 386 % 8 = 2 |
| **3** | Garpu | h("Garpu") = 511 % 8 = 7 → collision → probe to 3 |
| **4** | Celana | h("Celana") = 580 % 8 = 4 |
| **5** | Gelas | h("Gelas") = 492 % 8 = 4 → collision → probe to 5 |
| **6** | Gunting | h("Gunting") = 732 % 8 = 4 → collision → probe to 6 |
| **7** | Handphone | h("Handphone") = 917 % 8 = 5 → collision → probe to 7 |
