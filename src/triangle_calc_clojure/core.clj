(ns triangle-calc-clojure.core
  (:gen-class))



(defn side-checker [side-one side-two side-three]
  (cond 
    (and
        (= side-one side-two)
        (= side-two side-three))
    "Equilateral"
    
    (or
        (= side-one side-two)
        (or
            (= side-one side-three)
            (= side-two side-three)))
    "Isoceles"
    
    :else "Scalene"))
        

(defn -main []
  (println "Please enter the length of each side of the triangle one at a time.")
  (let [side-one (read-line)
        side-two (read-line)
        side-three (read-line)
        triangle-type (side-checker side-one side-two side-three)]
    (println triangle-type)))
