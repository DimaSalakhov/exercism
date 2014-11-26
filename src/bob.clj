(ns bob
  (:require [clojure.string :refer [blank?]]))

(defn upper-case-letters-only? [string]
  (and (re-find #"[A-Z]" string)
       (nil? (re-find #"[a-z]" string))))

(defn response-for [phrase]
  (cond
    (blank? phrase) "Fine. Be that way!"
    (upper-case-letters-only? phrase) "Whoa, chill out!"
    (= \? (last phrase)) "Sure."
    :else "Whatever."))