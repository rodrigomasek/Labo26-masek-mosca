#!/bin/sh

export DIRNAME="$(dirname "$(readlink -f "$0")")"
export SYSTEM_LD_LIBRARY_PATH="$LD_LIBRARY_PATH"

export SUPERTUXKART_DATADIR="$DIRNAME"
export SUPERTUXKART_ASSETS_DIR="$DIRNAME/data/"

cd "$DIRNAME"

export LD_LIBRARY_PATH="$DIRNAME/lib:$LD_LIBRARY_PATH"
"$DIRNAME/bin/supertuxkart" "$@"

