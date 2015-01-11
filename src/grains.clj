 (ns grains)

 (defn square
  [pow]
  (reduce * 1 (repeat (dec pow) (if (> 32 pow) 2 2N))))

 (defn total
  []
  (dec (square 65)))
