# Gatsby Starter Ghost

A simple Java console program that reads DNA data from a .txt file. It tells the user whether the DNA sequence contains a protein, and performs several other actions.

- Prints DNA sequence
- Prints length of DNA sequence
- Tells the user if a protein is found
- Prints location of start and stop signal

**Please note that** this project serves only as a simple portfolio piece to showcase my code. This code **should not** be used in real projects. 

---
DNA is composed of a series of nucleotides abbreviated as:

    A: Adenine
    C: Cytosine
    G: Guanine
    T: Thymine

This program works by searching the DNA sequences for specific codons. A codon is a trinucleotide sequence, or more simply, a group of three nucleotides. For example, ACG is a codon.

A protein has a start codon (ATG) and a stop codon (TGA), and this program will detect whether these patterns exist in the .txt file. 

# Using and Running

Simply run JavaDNAProteinDetector.java

At the prompt, enter the filename you would like to read. Several sample files are included:
1. dna1.txt
2. dna2.txt
3. dna3.txt

# Limitations

This program works for small DNA sequences, and is not built to accurately read large DNA sequences that contain multiple proteins.