 (ns leap)

 (defn leap-year? [year]
  (cond
   (pos? (rem year 4)) false
   (pos? (rem year 100)) true
   (pos? (rem year 400)) false
   :else true))