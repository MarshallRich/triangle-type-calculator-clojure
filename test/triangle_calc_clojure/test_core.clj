(ns triangle-calc-clojure.test_core
  (:require [clojure.test :as t]
            [triangle-calc-clojure.core :refer :all]))

(t/deftest equilateral-test
  (t/is (= true (.equals "Equilateral" (side-checker 1 1 1)))))

(t/deftest isoceles-test
  (t/is (= true (.equals "Isoceles" (side-checker 1 1 2))))
  (t/is (= true (.equals "Isoceles" (side-checker 1 2 1))))
  (t/is (= true (.equals "Isoceles" (side-checker 2 1 1)))))

(t/deftest scalene-test
  (t/is (= true (.equals "Scalene" (side-checker 1 2 3)))))