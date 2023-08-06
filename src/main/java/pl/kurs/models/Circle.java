package pl.kurs.models;

import java.util.Objects;

    public class Circle extends Figure {
        private double radius;

        Circle(double radius) {
            this.radius = radius;


        }

        @Override
        public double surface() {
            return Math.PI * radius * radius;
        }

        @Override
        public double circuit() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String figureDescription() {
            return ": Koło o promieniu " + radius + ".";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Circle circle = (Circle) o;
            return Double.compare(circle.radius, radius) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), radius);
        }
    }

