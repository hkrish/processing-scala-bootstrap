#!/bin/sh

cd target/scala-2.10/classes && scala -cp ./:../../../lib/core.jar:../../../lib/gluegen-rt.jar:../../../lib/jogl-all.jar:../../../lib/psmoveapi.jar -Djava.library.path=../../../lib PBootstrap