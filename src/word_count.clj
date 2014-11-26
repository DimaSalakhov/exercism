 (ns word-count
  (:require [clojure.string :refer [lower-case]]))

 (defn word-count [phrase]
  (frequencies (re-seq #"\w+" (lower-case phrase))))