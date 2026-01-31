## 1. Garbage Collection Mechanism

### Q1. What is Garbage Collection?
**Ans:** Automatic memory management process that removes unused objects from memory.

---

### Q2. What is `System.gc()`?
**Ans:**
- Used to **request** JVM to run Garbage Collector.
- Executed by a **Daemon Thread**.
- It is a **cleanup process**.
- **Not guaranteed** to run immediately.
Example:
```java
public class Demo {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args) {
        Demo s1 = new Demo();
        s1 = null; // Object becomes eligible for GC
        System.gc(); // Requesting GC
    }
}
```

---

### Q3. What is `finalize()` method?
**Ans:**
- Method called by **Garbage Collector before object destruction**.
- Used for cleanup operations (closing DB connections, files, etc.).
- Not called manually by programmer.

**Syntax:**
```java
protected void finalize() throws Throwable { }
```

---
## Finalize() vs Final vs Finally()

| Keyword  | Type     | Usage / Description                                                                                                                              |
| -------- | -------- | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| final    | Modifier | Immutable/Constant. <ul><li>Variable: Cannot change value.</li> <li>Method: Cannot be overridden.</li> <li>Class: Cannot be inherited.</li></ul> |
| finally  | Block    | Always executes. Used with try-catch blocks for cleanup (e.g., closing files), regardless of exceptions.                                         |
| finalize | Method   | Cleanup. Called by GC before object deletion (as detailed above).                                                                                |
