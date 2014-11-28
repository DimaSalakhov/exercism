 (ns point-mutations)

 (defn hamming-distance[dna1 dna2]
  (if (= (count dna1) (count dna2))
   (count (filter #(apply not= %) (map list dna1 dna2)))
    nil))