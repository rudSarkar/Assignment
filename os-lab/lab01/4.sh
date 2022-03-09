#!/bin/bash

read inputtext

echo "Alphabets = $(echo -n $inputtext | grep -Po '[a-zA-z]' | wc -l)"
echo "Digits = $(echo -n $inputtext | grep -Po '\d' | wc -l)"
echo "Special characters = $(echo -n $inputtext | grep -Po '[^A-Za-z0-9]' | wc -l)"
