 (ns etl
  (require [clojure.string :as str]))

 (defn transform [dictionary]
   (into {}
         (for [[score letters] dictionary
               letter letters]
           [(str/lower-case letter) score])))