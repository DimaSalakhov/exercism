 (ns beer-song
   (:require [clojure.string :refer [join capitalize]]))

 (defn say-bottles [x]
   (cond
     (= 1 x) "1 bottle"
     (= 0 x) "no more bottles"
     :else (str x " bottles")))

 (defn verse [x]
   (str (capitalize (format "%1$s of beer on the wall, %1$s of beer.\n" (say-bottles x)))
        (cond
          (= x 1) (format "Take it down and pass it around, %1$s of beer on the wall.\n" (say-bottles (dec x)))
          (= x 0) (format "Go to the store and buy some more, %1$s of beer on the wall.\n" (say-bottles 99))
          :else (format "Take one down and pass it around, %1$s of beer on the wall.\n" (say-bottles (dec x))))))

 (defn sing
   ([x](sing x 0))
   ([x y]
    (join "\n" (map verse (range x (dec y) -1)))))