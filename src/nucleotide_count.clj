 (ns nucleotide-count)

 (def possible-values #{\G, \C, \T, \A, \U})

 (defn nucleotide-counts [dna]
   (merge-with + {\G 0, \C 0, \T 0, \A 0} (frequencies dna)))

 (defn count [nucleotide dna]
   (if (contains? possible-values nucleotide)
     ((nucleotide-counts dna) nucleotide 0)
     (throw (Exception. "invalid nucleotide"))))

