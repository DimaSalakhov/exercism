 (ns anagram
  (:require [clojure.string :refer [lower-case]]))

 (defn anagram? [a b]
  (let [lower-a (lower-case a)
        lower-b (lower-case b)]
  (and (not= lower-a lower-b) (= (sort lower-a) (sort lower-b)))))

 (defn anagrams-for [word candidates]
  (filter #(anagram? word %) candidates))
