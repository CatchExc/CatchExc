public @interface CatchExcLogger {
    boolean log() default true;
    boolean mask() default false;
    String withChar() default "*";
}
