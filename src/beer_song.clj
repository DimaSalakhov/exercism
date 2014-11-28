 (ns beer-song
   (:require [clojure.string :refer [join capitalize]]))

 (defn verse [x]
   (case x
      2 "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
      1 "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
      0 "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
      (format "%1$s bottles of beer on the wall, %1$s bottles of beer.\nTake one down and pass it around, %2$s bottles of beer on the wall.\n" x (dec x))))

 (defn sing
   ([x](sing x 0))
   ([x y]
    (join "\n" (map verse (range x (dec y) -1)))))