 (ns phone-number
   (require [clojure.string :as s]))

 (defn number [s]
   (let [ph (s/replace s #"\D" "")
         length (count ph)]
     (cond
       (and (= 11 length) (= \1 (first ph))) (subs ph 1)
       (= 10 length) ph
        :else "0000000000")))

 (defn area-code [s]
   (subs (number s) 0 3))

 (defn pretty-print [s]
   (let [number (number s)]
     (format "(%s) %s-%s" (subs number 0 3) (subs number 3 6) (subs number 6))))
