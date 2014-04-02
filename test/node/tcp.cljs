(ns test.node.tcp
  (:require [cemerick.cljs.test :as test]
            [cljs.core.async :as async]
            [node.tcp :as tcp]
            [node.utils :refer [json->edn]])
  (:require-macros [cljs.core.async.macros :refer [go]]
                   [cemerick.cljs.test
                    :refer [is are deftest done with-test
                            run-tests testing
                            test-var]]))

(deftest ^:async core-async-test
  (go (is (= 2 3))
      (done)))

