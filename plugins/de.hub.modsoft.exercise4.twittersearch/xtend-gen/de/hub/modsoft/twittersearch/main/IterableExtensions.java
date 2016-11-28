package de.hub.modsoft.twittersearch.main;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

@SuppressWarnings("all")
public class IterableExtensions {
  private static class Result<T extends Object> implements Iterator<T> {
    private ArrayList<T> elements = new ArrayList<T>();
    
    private ArrayList<Iterable<T>> iterables = new ArrayList<Iterable<T>>();
    
    public void add(final T element) {
      this.elements.add(element);
    }
    
    public void addAll(final Iterable<T> iterable) {
      this.iterables.add(iterable);
    }
    
    public Iterator<T> reset() {
      Iterator<T> _xblockexpression = null;
      {
        this.elements.clear();
        this.iterables.clear();
        this.iterables.add(this.elements);
        _xblockexpression = this.iterator = null;
      }
      return _xblockexpression;
    }
    
    private Iterator<T> iterator = null;
    
    @Override
    public boolean hasNext() {
      boolean _equals = Objects.equal(this.iterator, null);
      if (_equals) {
        Iterable<T> _flatten = Iterables.<T>concat(this.iterables);
        Iterator<T> _iterator = _flatten.iterator();
        this.iterator = _iterator;
      }
      return this.iterator.hasNext();
    }
    
    @Override
    public T next() {
      boolean _equals = Objects.equal(this.iterator, null);
      if (_equals) {
        Iterable<T> _flatten = Iterables.<T>concat(this.iterables);
        Iterator<T> _iterator = _flatten.iterator();
        this.iterator = _iterator;
      }
      return this.iterator.next();
    }
    
    @Override
    public void remove() {
      throw new UnsupportedOperationException("Not supported, iterable is immutable.");
    }
  }
  
  public static <E extends Object, T extends Object> Iterable<T> iterate(final Iterable<E> source, final Function2<E, IterableExtensions.Result<T>, Void> function) {
    return new FluentIterable<T>() {
      @Override
      public Iterator<T> iterator() {
        final Iterator<E> sourceIterator = source.iterator();
        final IterableExtensions.Result<T> nextResult = new IterableExtensions.Result<T>();
        return new AbstractIterator<T>() {
          @Override
          protected T computeNext() {
            boolean _hasNext = nextResult.hasNext();
            if (_hasNext) {
              return nextResult.next();
            } else {
              while (sourceIterator.hasNext()) {
                {
                  final E next = sourceIterator.next();
                  nextResult.reset();
                  function.apply(next, nextResult);
                  boolean _hasNext_1 = nextResult.hasNext();
                  if (_hasNext_1) {
                    return nextResult.next();
                  }
                }
              }
              return this.endOfData();
            }
          }
        };
      }
    };
  }
  
  public static <E extends Object, T extends Object> Iterable<T> collect(final Iterable<E> source, final Function1<E, T> function) {
    final Function2<E, IterableExtensions.Result<T>, Void> _function = (E element, IterableExtensions.Result<T> result) -> {
      T _apply = function.apply(element);
      result.add(_apply);
      return null;
    };
    return IterableExtensions.<E, T>iterate(source, _function);
  }
  
  public static <E extends Object, T extends Object> Iterable<T> collectAll(final Iterable<E> source, final Function1<E, ? extends Iterable<T>> function) {
    final Function2<E, IterableExtensions.Result<T>, Void> _function = (E element, IterableExtensions.Result<T> result) -> {
      Iterable<T> _apply = function.apply(element);
      result.addAll(_apply);
      return null;
    };
    return IterableExtensions.<E, T>iterate(source, _function);
  }
  
  public static <E extends Object> Iterable<E> select(final Iterable<E> source, final Function1<E, Boolean> function) {
    final Function2<E, IterableExtensions.Result<E>, Void> _function = (E element, IterableExtensions.Result<E> result) -> {
      Boolean _apply = function.apply(element);
      if ((_apply).booleanValue()) {
        result.add(element);
      }
      return null;
    };
    return IterableExtensions.<E, E>iterate(source, _function);
  }
  
  public static <E extends Object> Iterable<E> closure(final Iterable<E> source, final Function1<E, Iterable<E>> function) {
    final Function2<E, IterableExtensions.Result<E>, Void> _function = (E element, IterableExtensions.Result<E> result) -> {
      result.add(element);
      Iterable<E> _apply = function.apply(element);
      Iterable<E> _closure = IterableExtensions.<E>closure(_apply, function);
      result.addAll(_closure);
      return null;
    };
    return IterableExtensions.<E, E>iterate(source, _function);
  }
  
  public static <E extends Object> Iterable<E> closure(final E source, final Function1<E, Iterable<E>> function) {
    return IterableExtensions.<E>closure(Collections.<E>unmodifiableSet(CollectionLiterals.<E>newHashSet(source)), function);
  }
  
  public static <E extends Object> Iterable<E> union(final Iterable<? extends E> one, final Iterable<? extends E> two) {
    final Iterator<? extends E> oneIterator = one.iterator();
    final Iterator<? extends E> twoIterator = two.iterator();
    return new FluentIterable<E>() {
      @Override
      public Iterator<E> iterator() {
        return new AbstractIterator<E>() {
          @Override
          protected E computeNext() {
            boolean _hasNext = oneIterator.hasNext();
            if (_hasNext) {
              return oneIterator.next();
            } else {
              boolean _hasNext_1 = twoIterator.hasNext();
              if (_hasNext_1) {
                return twoIterator.next();
              } else {
                return this.endOfData();
              }
            }
          }
        };
      }
    };
  }
  
  public static <E extends Object> Integer sum(final Iterable<E> source, final Function1<E, Integer> function) {
    final Function2<Integer, E, Integer> _function = (Integer sum, E element) -> {
      Integer _apply = function.apply(element);
      return Integer.valueOf(((sum).intValue() + (_apply).intValue()));
    };
    return org.eclipse.xtext.xbase.lib.IterableExtensions.<E, Integer>fold(source, Integer.valueOf(0), _function);
  }
  
  public static <E extends Object> Integer max(final Iterable<E> source, final Function1<E, Integer> function) {
    final Function2<Integer, E, Integer> _function = (Integer max, E element) -> {
      final Integer value = function.apply(element);
      Integer _xifexpression = null;
      boolean _greaterThan = (value.compareTo(max) > 0);
      if (_greaterThan) {
        _xifexpression = value;
      } else {
        _xifexpression = max;
      }
      return _xifexpression;
    };
    return org.eclipse.xtext.xbase.lib.IterableExtensions.<E, Integer>fold(source, Integer.valueOf(Integer.MIN_VALUE), _function);
  }
  
  @GwtIncompatible(value = "reflection")
  public static <E extends Object, T extends E> Iterable<T> typeSelect(final Iterable<E> source, final Class<T> type) {
    final Function1<E, Boolean> _function = (E it) -> {
      Class<?> _class = it.getClass();
      return Boolean.valueOf(type.isAssignableFrom(_class));
    };
    Iterable<E> _select = IterableExtensions.<E>select(source, _function);
    final Function1<E, T> _function_1 = (E it) -> {
      return ((T) it);
    };
    return IterableExtensions.<E, T>collect(_select, _function_1);
  }
  
  public static <E extends Object> Iterable<Iterable<E>> split(final Iterable<? extends E> iterable, final int splitSize) {
    return new FluentIterable<Iterable<E>>() {
      @Override
      public Iterator<Iterable<E>> iterator() {
        abstract class ____IterableExtensions_1 extends AbstractIterator<Iterable<E>> {
          boolean empty;
        }
        
        final Iterator<? extends E> source = iterable.iterator();
        return new ____IterableExtensions_1() {
          {
            empty = true;
          }
          @Override
          protected Iterable<E> computeNext() {
            ArrayList<E> _xifexpression = null;
            boolean _hasNext = source.hasNext();
            if (_hasNext) {
              this.empty = false;
              final ArrayList<E> split = new ArrayList<E>(splitSize);
              int i = 0;
              while ((source.hasNext() && (i++ < splitSize))) {
                E _next = source.next();
                split.add(_next);
              }
              return split;
            } else {
              ArrayList<E> _xifexpression_1 = null;
              if (this.empty) {
                ArrayList<E> _xblockexpression = null;
                {
                  this.empty = false;
                  _xblockexpression = new ArrayList<E>(0);
                }
                _xifexpression_1 = _xblockexpression;
              } else {
                return this.endOfData();
              }
              _xifexpression = _xifexpression_1;
            }
            return _xifexpression;
          }
        };
      }
    };
  }
  
  public static <E extends Object> Iterable<E> first(final Iterable<E> iterable, final int firstSize) {
    abstract class __IterableExtensions_4 extends FluentIterable<E> {
      final __IterableExtensions_4 _this__IterableExtensions_4 = this;
      
      int i;
    }
    
    final Iterator<E> sourceIterator = iterable.iterator();
    return new __IterableExtensions_4() {
      {
        i = 0;
      }
      @Override
      public Iterator<E> iterator() {
        return new AbstractIterator<E>() {
          @Override
          protected E computeNext() {
            boolean _and = false;
            boolean _hasNext = sourceIterator.hasNext();
            if (!_hasNext) {
              _and = false;
            } else {
              int _plusPlus = _this__IterableExtensions_4.i++;
              boolean _lessThan = (_plusPlus < firstSize);
              _and = _lessThan;
            }
            if (_and) {
              return sourceIterator.next();
            } else {
              return this.endOfData();
            }
          }
        };
      }
    };
  }
  
  public static <E extends Object> E first(final Iterable<E> iterable) {
    final Iterator<E> iterator = iterable.iterator();
    boolean _hasNext = iterator.hasNext();
    if (_hasNext) {
      return iterator.next();
    } else {
      return null;
    }
  }
  
  public static <E extends Object> Iterable<E> unique(final Iterable<E> source, final Function1<E, Object> keyPredicate) {
    HashMap<Object, E> _newHashMap = CollectionLiterals.<Object, E>newHashMap();
    final Function2<HashMap<Object, E>, E, HashMap<Object, E>> _function = (HashMap<Object, E> result, E element) -> {
      Object _apply = keyPredicate.apply(element);
      result.put(_apply, element);
      return result;
    };
    HashMap<Object, E> _fold = org.eclipse.xtext.xbase.lib.IterableExtensions.<E, HashMap<Object, E>>fold(source, _newHashMap, _function);
    return _fold.values();
  }
  
  public static <E extends Object> Iterable<E> unique(final Iterable<E> source) {
    final Function1<E, Object> _function = (E it) -> {
      return it;
    };
    return IterableExtensions.<E>unique(source, _function);
  }
  
  public static <E extends Object> void forEachUntil(final Iterable<E> source, final Function1<? super E, ? extends Boolean> predicate) {
    final Iterator<E> it = source.iterator();
    boolean current = true;
    while ((it.hasNext() && current)) {
      E _next = it.next();
      Boolean _apply = predicate.apply(_next);
      current = (_apply).booleanValue();
    }
  }
}
