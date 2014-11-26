 (ns rna-transcription)

 (def dna-to-rna-mapping {\G \C, \C \G, \T \A, \A \U})
 (defn map-nucleotide [nuc]
  (if-let [result (dna-to-rna-mapping nuc)]
   result
   (throw (AssertionError. "error"))))

 (defn to-rna [dna]
  (apply str (map map-nucleotide dna)))

