🚀 Mastering Java Interfaces: A Three-Pillar Approach

In modern Java development, interfaces are more than just "contracts." They are tools for metadata, functional programming, and system design. In this project, I’ve demonstrated the three types of interfaces used in a real-world scenario:
1. The Marker Interface (Permission)

Player implements Serializable The Serializable interface is a Marker Interface. It has no methods. By "tagging" the Player class with it, I am giving the JVM permission to convert the object into a byte stream. This is essential for saving game data to a hard drive.
2. The Functional Interface (SAM)

interface LevelUp { int doubleexp(int currentLevel); } This is a Functional Interface because it contains exactly one abstract method. In the main method, I used a Lambda Expression (lvl) -> lvl * 2 to implement this interface instantly. This makes the code cleaner and avoids the need for bulky "Anonymous Inner Classes."
3. The Normal Interface (Contract)

interface Gamework { void attack(); void heal(); } This is a standard interface with multiple methods. It defines the "behavior" that any game system must follow. By implementing this, the GameSystem1 class is forced to provide logic for both attacking and healing.
💾 Key Feature: Object Serialization

The code doesn't just print to the console; it interacts with the file system:

    Serialization: It takes the Player object and saves it into savegame.txt using ObjectOutputStream.

    Deserialization: It reads the object back from the file using ObjectInputStream, proving that the state of the object was preserved.
